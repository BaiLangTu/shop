package red.mlz.module.module.goods.request;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GoodsContentDto {
    private String type;
    private String content;
}
