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

public val BulkGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4798f, 10.6901f)
                lineTo(2.0098f, 15.7201f)
                curveTo(2.1198f, 14.1301f, 3.1098f, 12.4601f, 5.1098f, 11.9701f)
                curveTo(4.5198f, 9.6401f, 5.0198f, 7.4501f, 6.5398f, 5.8601f)
                curveTo(8.2698f, 4.0501f, 11.0298f, 3.3301f, 13.4098f, 4.0701f)
                curveTo(15.5998f, 4.7401f, 17.1398f, 6.5401f, 17.6898f, 9.0401f)
                curveTo(18.7798f, 9.2901f, 19.7498f, 9.8601f, 20.4798f, 10.6901f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.17f, 18.7399f)
                curveTo(19.13f, 19.6899f, 17.77f, 20.2199f, 16.35f, 20.2199f)
                horizontalLineTo(5.97f)
                curveTo(3.23f, 20.0199f, 2.0f, 17.9099f, 2.0f, 16.0299f)
                curveTo(2.0f, 15.9299f, 2.0f, 15.8299f, 2.01f, 15.7199f)
                lineTo(20.48f, 10.6899f)
                curveTo(21.05f, 11.2999f, 21.48f, 12.0499f, 21.74f, 12.9099f)
                curveTo(22.4f, 15.0799f, 21.8f, 17.3099f, 20.17f, 18.7399f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
