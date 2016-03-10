package org.openpnp.vision.pipeline.stages;

import java.io.File;

import org.opencv.highgui.Highgui;
import org.openpnp.vision.pipeline.CvPipeline;
import org.openpnp.vision.pipeline.CvStage;
import org.simpleframework.xml.Attribute;

/**
 * Replace the working image with the image loaded from a given path.
 */
public class LoadImage extends CvStage {
    @Attribute
    private File file = new File("");

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public Result process(CvPipeline pipeline) throws Exception {
        return new Result(Highgui.imread(file.getAbsolutePath()));
    }
}
