package com.tinet.clink.openapi.request.cdr;

import com.tinet.clink.openapi.PathEnum;
import com.tinet.clink.openapi.request.AbstractRequestModel;
import com.tinet.clink.openapi.response.cdr.DescribeCdrIbResponse;
import com.tinet.clink.openapi.utils.HttpMethodType;

/**
 * 查询呼入通话记录详情请求
 *
 * @author huwk
 * @date 2018/10/24
 **/
public class DescribeCdrIbRequest extends AbstractRequestModel<DescribeCdrIbResponse> {

    /**
     * 通话记录唯一标识
     */
    private String mainUniqueId;

    public DescribeCdrIbRequest() {
        super(PathEnum.DescribeCdrIb.value(), HttpMethodType.GET);
    }

    public String getMainUniqueId() {
        return mainUniqueId;
    }

    public void setMainUniqueId(String mainUniqueId) {
        this.mainUniqueId = mainUniqueId;
        if (mainUniqueId != null) {
            putQueryParameter("mainUniqueId", mainUniqueId);
        }
    }

    @Override
    public Class<DescribeCdrIbResponse> getResponseClass() {
        return DescribeCdrIbResponse.class;
    }
}
