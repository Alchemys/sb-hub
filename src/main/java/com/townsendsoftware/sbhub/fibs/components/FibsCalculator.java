package com.townsendsoftware.sbhub.fibs.components;

import static com.townsendsoftware.sbhub.fibs.constants.FibsConstants.MAX_ITERATIONS;
import static com.townsendsoftware.sbhub.fibs.constants.FibsConstants.CURRENT_PROTOBUF_VERSION;

import java.util.ArrayList;
import java.util.List;

import com.townsendsoftware.sbhub.protos.*;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class FibsCalculator {

    public FibonacciResponse generateSequence(long seqSeed0, long seqSeed1, int iterations) {
        FibonacciParameters parameters = FibonacciParameters.newBuilder()
            .setVersion(CURRENT_PROTOBUF_VERSION)
            .setSequenceSeed0(seqSeed0)
            .setSequenceSeed1(seqSeed1)
            .setIterations(iterations)
            .build();

        // Assume success
        ResponseMessage errorMsg = ResponseMessage.newBuilder()
            .setVersion(CURRENT_PROTOBUF_VERSION)
            .setLevel(ResponseLevel.SUCCESS)
            .setMessage("Success")
            .build();

        List<Long> generatedSequence = new ArrayList<Long>();

        if (seqSeed0 >= 0 && seqSeed1 > 0 && iterations > 0) {
            if (iterations <= MAX_ITERATIONS) {
                if (seqSeed0 >= seqSeed1 && seqSeed1 != 1 && seqSeed0 !=1) {
                    String msgStr = String.format("seqSeed0 must be < seqSeed1 (unless both are 1). Provided: seqSeed0[%s], seqSeed1[%s], iterations[%s]", seqSeed0, seqSeed1, iterations);
                    log.error(msgStr);
                    errorMsg = ResponseMessage.newBuilder()
                        .setVersion(CURRENT_PROTOBUF_VERSION)
                        .setLevel(ResponseLevel.ERROR)
                        .setMessage(msgStr)
                        .build();
                } else {
                    log.info("Generating fibonacci sequence using seeds {}, {} for {} iterations", seqSeed0, seqSeed1, iterations);
                    generatedSequence.add(seqSeed0);
                    generatedSequence.add(seqSeed1);
                    for (int seqCount = 2; seqCount < iterations; seqCount++) {
                        // This should work since we have already seeded the first two values
                        long toAdd = (generatedSequence.get(seqCount-1).longValue() + generatedSequence.get(seqCount-2).longValue());
                        generatedSequence.add(toAdd);
                    } 
                }
            } else {
                String msgStr = String.format(
                        "provided iterations '%s' exceeds the max number of iterations ('%s') for this application",
                        iterations, MAX_ITERATIONS);
                log.error(msgStr);
                errorMsg = ResponseMessage.newBuilder()
                    .setVersion(CURRENT_PROTOBUF_VERSION)
                    .setLevel(ResponseLevel.ERROR)
                    .setMessage(msgStr)
                    .build();
            }
        } else {
            String msgStr = String.format(
                    "seqSeed0, seqSeed1 and iterations must be positive long values. Provided: seqSeed0[%s], seqSeed1[%s], iterations[%s]",
                    seqSeed0, seqSeed1, iterations);
            log.error(msgStr);
            errorMsg = ResponseMessage.newBuilder()
                .setVersion(CURRENT_PROTOBUF_VERSION)
                .setLevel(ResponseLevel.ERROR)
                .setMessage(msgStr)
                .build();
        }

        FibonacciSequence fibSequence = FibonacciSequence.newBuilder()
            .setVersion(CURRENT_PROTOBUF_VERSION)
            .addAllSequence(generatedSequence)
            .setCount((CollectionUtils.isNotEmpty(generatedSequence)) ? generatedSequence.size() : 0)
            .build();

        return FibonacciResponse.newBuilder()
            .setVersion(CURRENT_PROTOBUF_VERSION)
            .setSequence(fibSequence)
            .setParameters(parameters)
            .setMessage(errorMsg)
            .build();
    }
}