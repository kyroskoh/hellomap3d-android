package com.nutiteq.advancedmap3;

import android.os.Bundle;

import com.nutiteq.advancedmap3.datasource.MyHttpTileDataSource;
import com.nutiteq.datasources.TileDataSource;
import com.nutiteq.layers.RasterTileLayer;

/**
 * A sample demonstrating how to use raster layers with external tile data sources.
 */
public class AerialMapActivity extends MapSampleBaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		// Initialize a Bing raster data source. Note: tiles start from level 1, there is no single root tile!
		TileDataSource baseRasterTileDataSource = new MyHttpTileDataSource(1, 19, "https://ecn.t3.tiles.virtualearth.net/tiles/a{quadkey}.jpeg?g=471&mkt=en-US");
        
        // Create raster layer
        baseLayer = new RasterTileLayer(baseRasterTileDataSource);
        mapView.getLayers().add(baseLayer);
	}
}
