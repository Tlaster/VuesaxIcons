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

public val BulkGroup.Maincomponent: ImageVector
    get() {
        if (_maincomponent != null) {
            return _maincomponent!!
        }
        _maincomponent = Builder(name = "Maincomponent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.95f, 14.55f)
                lineTo(18.28f, 17.22f)
                lineTo(17.22f, 18.28f)
                lineTo(14.55f, 20.95f)
                curveTo(13.15f, 22.35f, 10.85f, 22.35f, 9.45f, 20.95f)
                lineTo(6.78f, 18.28f)
                lineTo(5.72f, 17.22f)
                lineTo(3.05f, 14.55f)
                curveTo(1.65f, 13.15f, 1.65f, 10.85f, 3.05f, 9.45f)
                lineTo(5.72f, 6.78f)
                lineTo(6.78f, 5.72f)
                lineTo(9.45f, 3.05f)
                curveTo(10.85f, 1.65f, 13.15f, 1.65f, 14.55f, 3.05f)
                lineTo(17.22f, 5.72f)
                lineTo(18.28f, 6.78f)
                lineTo(20.95f, 9.45f)
                curveTo(22.35f, 10.85f, 22.35f, 13.15f, 20.95f, 14.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0607f, 12.0002f)
                lineTo(18.2807f, 17.2202f)
                lineTo(17.2207f, 18.2802f)
                lineTo(12.0007f, 13.0602f)
                lineTo(6.7807f, 18.2802f)
                lineTo(5.7207f, 17.2202f)
                lineTo(10.9407f, 12.0002f)
                lineTo(5.7207f, 6.7802f)
                lineTo(6.7807f, 5.7202f)
                lineTo(12.0007f, 10.9402f)
                lineTo(17.2207f, 5.7202f)
                lineTo(18.2807f, 6.7802f)
                lineTo(13.0607f, 12.0002f)
                close()
            }
        }
        .build()
        return _maincomponent!!
    }

private var _maincomponent: ImageVector? = null
