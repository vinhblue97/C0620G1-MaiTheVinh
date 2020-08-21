package exception_debug.exercise.illegal_triangle_exception;

class TriangleWithException {
    private double firstSize;
    private double secondSize;
    private double thirdSize;

    public TriangleWithException(double fisrtSize, double secondSize, double thirdSize) {
        this.firstSize = fisrtSize;
        this.secondSize = secondSize;
        this.thirdSize = thirdSize;
    }

    public void illegalTriangleException() {
        if (firstSize < 0||secondSize<0||thirdSize<0||(firstSize+secondSize<thirdSize)||(secondSize+thirdSize<firstSize)||(firstSize+thirdSize<secondSize)){
            throw new IllegalArgumentException();
        }
    }


}
