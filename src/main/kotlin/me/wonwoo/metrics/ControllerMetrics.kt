package me.wonwoo.metrics

import org.springframework.boot.actuate.endpoint.PublicMetrics
import org.springframework.boot.actuate.metrics.Metric
import org.springframework.stereotype.Component

/**
 * Created by wonwoolee on 2017. 6. 29..
 */

@Component
class ControllerMetrics : PublicMetrics {
  override fun metrics(): List<Metric<*>> {
    return listOf(Metric("total.mem", Runtime.getRuntime().maxMemory()));
  };
}