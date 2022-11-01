package moe.tlaster.icons.vuesax.vuesaxicons.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BulkGroup

public val BulkGroup.Augur: ImageVector
    get() {
        if (_augur != null) {
            return _augur!!
        }
        _augur = Builder(name = "Augur", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFFffffff)), stroke = null, fillAlpha = 0.58f, strokeAlpha
                    = 0.58f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9999f, 11.7498f)
                curveTo(14.7299f, 11.7498f, 14.4599f, 11.5998f, 14.3299f, 11.3398f)
                lineTo(12.0399f, 6.7498f)
                horizontalLineTo(11.9699f)
                lineTo(9.6799f, 11.3398f)
                curveTo(9.4999f, 11.7098f, 9.0499f, 11.8598f, 8.6699f, 11.6798f)
                curveTo(8.2999f, 11.4898f, 8.1499f, 11.0398f, 8.3299f, 10.6698f)
                lineTo(10.8299f, 5.6698f)
                curveTo(10.9599f, 5.4198f, 11.2199f, 5.2598f, 11.4999f, 5.2598f)
                horizontalLineTo(12.4999f)
                curveTo(12.7799f, 5.2598f, 13.0399f, 5.4198f, 13.1699f, 5.6698f)
                lineTo(15.6699f, 10.6698f)
                curveTo(15.8599f, 11.0398f, 15.7099f, 11.4898f, 15.3299f, 11.6798f)
                curveTo(15.2299f, 11.7198f, 15.1099f, 11.7498f, 14.9999f, 11.7498f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0007f, 18.75f)
                curveTo(11.8707f, 18.75f, 11.7307f, 18.71f, 11.6107f, 18.64f)
                lineTo(6.6108f, 15.64f)
                curveTo(6.2708f, 15.44f, 6.1508f, 15.01f, 6.3208f, 14.66f)
                lineTo(7.3208f, 12.66f)
                curveTo(7.5107f, 12.29f, 7.9608f, 12.14f, 8.3308f, 12.32f)
                curveTo(8.7008f, 12.51f, 8.8507f, 12.96f, 8.6707f, 13.33f)
                lineTo(7.9808f, 14.71f)
                lineTo(12.0007f, 17.12f)
                lineTo(16.0207f, 14.71f)
                lineTo(15.3307f, 13.33f)
                curveTo(15.1407f, 12.96f, 15.2907f, 12.51f, 15.6707f, 12.32f)
                curveTo(16.0407f, 12.14f, 16.4907f, 12.28f, 16.6807f, 12.66f)
                lineTo(17.6807f, 14.66f)
                curveTo(17.8607f, 15.01f, 17.7307f, 15.44f, 17.3907f, 15.64f)
                lineTo(12.3907f, 18.64f)
                curveTo(12.2707f, 18.71f, 12.1307f, 18.75f, 12.0007f, 18.75f)
                close()
            }
        }
        .build()
        return _augur!!
    }

private var _augur: ImageVector? = null
