package MathEngine.handlers.impl;

import MathEngine.handlers.MathHandler;
import MathEngine.model.NodeOperationTree;

import java.util.List;

public class PowTwoHandler implements MathHandler {
    @Override
    public double processOperation(List<NodeOperationTree> leaves) {


        return Math.pow(leaves.get(0).getValue(), 2);
    }
}
