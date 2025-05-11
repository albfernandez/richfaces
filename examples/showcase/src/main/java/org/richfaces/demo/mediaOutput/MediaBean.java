package org.richfaces.demo.mediaOutput;

import java.io.BufferedInputStream;
import java.io.OutputStream;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.ExternalContext;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

@Named("mediaBean")
@RequestScoped
public class MediaBean {
    private static final int BUFFER_SIZE = 8192;
    private static final String RICHFACES_MEDIA_OUTPUT_IMAGE_SOURCE = "/resources/org.richfaces.showcase/img/source.png";
    private Color[] colors;
    private MediaReader mr = new MediaReader();

    public void process(OutputStream outStream, Object data) throws Exception {
        colors = ((MediaData) data).getNewColors();

        ExternalContext extContext = FacesContext.getCurrentInstance().getExternalContext();
        BufferedInputStream inStream = new BufferedInputStream(
                extContext.getResourceAsStream(RICHFACES_MEDIA_OUTPUT_IMAGE_SOURCE), BUFFER_SIZE);
        try {
            // skip 8-bytes of header
            byte[] bs = new byte[8];
            if (inStream.read(bs) < bs.length) {
                throw new IllegalArgumentException();
            }
            outStream.write(bs);

            mr.write(colors, outStream, inStream);
        } finally {
            inStream.close();
            outStream.close();
        }
    }
}
