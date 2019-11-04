package com.github.intellectualsites.plotsquared.plot.object;

public abstract class PlotFilter {
    public boolean allowsArea(final PlotArea area) {
        return true;
    }

    public boolean allowsPlot(final Plot plot) {
        return true;
    }
}
