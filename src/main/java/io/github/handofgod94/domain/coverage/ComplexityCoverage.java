package io.github.handofgod94.domain.coverage;

import io.github.handofgod94.domain.Report;
import io.github.handofgod94.domain.ReportLine;

public class ComplexityCoverage extends Coverage {

  ComplexityCoverage(CoverageCategory category, Report report) {
    super(category, report);
  }

  @Override
  public long calculateMissed() {
    return report.getLines().map(ReportLine::getComplexityMissed).sum().longValue();
  }

  @Override
  public long calculateCovered() {
    return report.getLines().map(ReportLine::getComplexityCovered).sum().longValue();
  }
}
