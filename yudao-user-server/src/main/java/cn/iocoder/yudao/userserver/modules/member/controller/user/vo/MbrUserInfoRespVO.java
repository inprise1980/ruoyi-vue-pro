package cn.iocoder.yudao.userserver.modules.member.controller.user.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel("用户个人信息 Response VO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MbrUserInfoRespVO {

    @ApiModelProperty(value = "用户昵称", required = true, example = "芋艿")
    private String nickName;

    @ApiModelProperty(value = "用户头像", required = true, example = "/infra/file/get/35a12e57-4297-4faa-bf7d-7ed2f211c952")
    private String avatar;
}
