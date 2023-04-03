package google.drvie.domain;

import google.drvie.infra.AbstractEvent;
import java.util.*;
import lombok.Data;

@Data
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long field;
    private List<String> url;
}
