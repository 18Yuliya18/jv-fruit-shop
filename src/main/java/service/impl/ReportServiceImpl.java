package service.impl;

import java.util.Map;
import service.ReportService;

public class ReportServiceImpl implements ReportService {
    private static final String REPORT_CAPTION = "fruit,quantity";
    private static final String REPORT_SEPARATOR = ",";

    @Override
     public String getReport(Map<Fruit, Integer> report) {
        StringBuilder stringForReport = new StringBuilder()
                .append(REPORT_CAPTION)
                .append(System.lineSeparator());
        for (Map.Entry<Fruit, Integer> mapValue : report.entrySet()) {
            stringForReport.append(mapValue.getKey())
                    .append(REPORT_SEPARATOR)
                    .append(mapValue.getValue())
                    .append(System.lineSeparator());
        }
        return stringForReport.toString();
    }
}