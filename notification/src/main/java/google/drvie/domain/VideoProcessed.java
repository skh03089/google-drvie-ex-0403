package google.drvie.domain;

import google.drvie.domain.*;
import google.drvie.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long field;
    private Object url;
}
