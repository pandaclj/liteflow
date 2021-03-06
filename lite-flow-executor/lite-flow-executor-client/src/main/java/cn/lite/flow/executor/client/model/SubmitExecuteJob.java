package cn.lite.flow.executor.client.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @description: 提交任务实体
 * @author: yueyunyue
 * @create: 2019-01-13
 **/
@Data
@ToString
public class SubmitExecuteJob implements Serializable {

    private Long instanceId;            //console任务实例id

    private Long pluginId;              //插件id

    private String pluginConf;          //插件配置信息

}
