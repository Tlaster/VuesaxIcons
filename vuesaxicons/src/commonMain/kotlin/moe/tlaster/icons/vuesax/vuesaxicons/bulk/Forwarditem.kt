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

public val BulkGroup.Forwarditem: ImageVector
    get() {
        if (_forwarditem != null) {
            return _forwarditem!!
        }
        _forwarditem = Builder(name = "Forwarditem", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.2505f, 5.77f)
                verticalLineTo(9.0f)
                curveTo(21.2505f, 11.29f, 20.5205f, 12.02f, 18.2305f, 12.02f)
                horizontalLineTo(18.1305f)
                verticalLineTo(10.38f)
                curveTo(18.1305f, 7.26f, 16.7405f, 5.87f, 13.6205f, 5.87f)
                horizontalLineTo(11.9805f)
                verticalLineTo(5.77f)
                curveTo(11.9805f, 3.48f, 12.7105f, 2.75f, 15.0005f, 2.75f)
                horizontalLineTo(18.2305f)
                curveTo(20.5205f, 2.75f, 21.2505f, 3.48f, 21.2505f, 5.77f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6291f, 10.3801f)
                verticalLineTo(13.6201f)
                curveTo(16.6291f, 15.9001f, 15.8991f, 16.6301f, 13.6191f, 16.6301f)
                horizontalLineTo(10.3791f)
                curveTo(8.0991f, 16.6301f, 7.3691f, 15.9001f, 7.3691f, 13.6201f)
                verticalLineTo(10.3801f)
                curveTo(7.3691f, 8.1001f, 8.0991f, 7.3701f, 10.3791f, 7.3701f)
                horizontalLineTo(13.6191f)
                curveTo(15.8991f, 7.3701f, 16.6291f, 8.1001f, 16.6291f, 10.3801f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.02f, 18.13f)
                verticalLineTo(18.23f)
                curveTo(12.02f, 20.52f, 11.29f, 21.25f, 9.0f, 21.25f)
                horizontalLineTo(5.77f)
                curveTo(3.48f, 21.25f, 2.75f, 20.52f, 2.75f, 18.23f)
                verticalLineTo(15.0f)
                curveTo(2.75f, 12.71f, 3.48f, 11.98f, 5.77f, 11.98f)
                horizontalLineTo(5.87f)
                verticalLineTo(13.62f)
                curveTo(5.87f, 16.74f, 7.26f, 18.13f, 10.38f, 18.13f)
                horizontalLineTo(12.02f)
                close()
            }
        }
        .build()
        return _forwarditem!!
    }

private var _forwarditem: ImageVector? = null
