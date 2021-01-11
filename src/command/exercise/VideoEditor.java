package command.exercise;

public class VideoEditor {
    private double contrast = 0.5f;
    private String text;
    Video video;

    public VideoEditor(double contrast, String text, Video video) {
        this.video = video;
        setLabel(text);
        setContrast(contrast);
    }

    public String getLabel() {
        return video.getLabel();
    }

    public void setLabel(String text) {
        this.text = text;
        video.setLabel(text);
    }

    public void removeText() {
        this.text = "";
    }

    public double getContrast() {
        return contrast;
    }

    public void setContrast(double contrast) {
        this.contrast = contrast;
    }

    @Override
    public String toString() {
        return "VideoEditor{" + "contrast=" + contrast + ", text='" + text + '\'' + '}';
    }

}
