package com.webank.wedatasphere.exchangis.appconn;

import com.webank.wedatasphere.dss.standard.app.development.service.*;
import com.webank.wedatasphere.dss.standard.app.development.standard.AbstractDevelopmentIntegrationStandard;
import com.webank.wedatasphere.exchangis.appconn.service.ExchangisCRUDService;
import com.webank.wedatasphere.exchangis.appconn.service.ExchangisQueryService;
import com.webank.wedatasphere.exchangis.appconn.service.ExchangisRefExportService;
import com.webank.wedatasphere.exchangis.appconn.service.ExchangisRefImportService;

public class ExchangisDevelopmentIntegrationStandard  extends AbstractDevelopmentIntegrationStandard {
    @Override
    protected RefCRUDService createRefCRUDService() {
        return new ExchangisCRUDService();
    }

    @Override
    protected RefExecutionService createRefExecutionService() {
        return null;
    }

    @Override
    protected RefExportService createRefExportService() {
        return new ExchangisRefExportService();
    }

    @Override
    protected RefImportService createRefImportService() {
        return new ExchangisRefImportService();
    }

    @Override
    protected RefQueryService createRefQueryService() {
        return new ExchangisQueryService();
    }
}
