package moe.tlaster.icons.vuesax.vuesaxicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.TwotoneGroup

public val TwotoneGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.2691f, 13.0098f)
                curveTo(6.7391f, 12.7398f, 6.1491f, 12.5998f, 5.5491f, 12.5998f)
                curveTo(0.8691f, 12.9298f, 0.8691f, 19.7398f, 5.5491f, 20.0698f)
                horizontalLineTo(16.6391f)
                curveTo(17.9891f, 20.0798f, 19.2891f, 19.5798f, 20.2791f, 18.6698f)
                curveTo(23.5691f, 15.7998f, 21.8091f, 10.0298f, 17.4791f, 9.4798f)
                curveTo(15.9191f, 0.1098f, 2.3891f, 3.6698f, 5.5991f, 12.5998f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.8496f, 9.9198f)
                curveTo(16.3696f, 9.6598f, 16.9396f, 9.5198f, 17.5196f, 9.5098f)
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
