package laChiqui;

public class FogoArtificio {
    private String barulho;

    public FogoArtificio(String barulho) {
        this.barulho = barulho;
    }

    public String getBarulho() {
        return barulho;
    }

    public void setBarulho(String barulho) {
        this.barulho = barulho;
    }

    @Override
    public String toString() {
        return this.barulho;
    }
}
