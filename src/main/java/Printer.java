public class Printer {
    private int paperLeft;

    public Printer(int paperLeft){
        this.paperLeft = paperLeft;
    }

    public int getPaperLeft(){
        return this.paperLeft;
    }


    public int print(int pages, int copies) {
        if (this.paperLeft >= (pages * copies)) {
            this.paperLeft = (this.paperLeft - (copies * pages));
        }
        return this.paperLeft;
    }
}
