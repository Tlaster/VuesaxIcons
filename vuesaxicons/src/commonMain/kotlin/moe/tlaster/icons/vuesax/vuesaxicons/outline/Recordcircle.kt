package moe.tlaster.icons.vuesax.vuesaxicons.outline

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
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.Recordcircle: ImageVector
    get() {
        if (_recordcircle != null) {
            return _recordcircle!!
        }
        _recordcircle = Builder(name = "Recordcircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9707f, 22.75f)
                curveTo(6.0507f, 22.75f, 1.2207f, 17.93f, 1.2207f, 12.0f)
                curveTo(1.2207f, 6.07f, 6.0507f, 1.25f, 11.9707f, 1.25f)
                curveTo(17.8907f, 1.25f, 22.7207f, 6.07f, 22.7207f, 12.0f)
                curveTo(22.7207f, 17.93f, 17.9007f, 22.75f, 11.9707f, 22.75f)
                close()
                moveTo(11.9707f, 2.75f)
                curveTo(6.8707f, 2.75f, 2.7207f, 6.9f, 2.7207f, 12.0f)
                curveTo(2.7207f, 17.1f, 6.8707f, 21.25f, 11.9707f, 21.25f)
                curveTo(17.0707f, 21.25f, 21.2207f, 17.1f, 21.2207f, 12.0f)
                curveTo(21.2207f, 6.9f, 17.0707f, 2.75f, 11.9707f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9995f, 16.98f)
                curveTo(9.2495f, 16.98f, 7.0195f, 14.75f, 7.0195f, 12.0f)
                curveTo(7.0195f, 9.25f, 9.2495f, 7.02f, 11.9995f, 7.02f)
                curveTo(14.7495f, 7.02f, 16.9795f, 9.25f, 16.9795f, 12.0f)
                curveTo(16.9795f, 14.75f, 14.7495f, 16.98f, 11.9995f, 16.98f)
                close()
                moveTo(11.9995f, 8.52f)
                curveTo(10.0795f, 8.52f, 8.5195f, 10.08f, 8.5195f, 12.0f)
                curveTo(8.5195f, 13.92f, 10.0795f, 15.48f, 11.9995f, 15.48f)
                curveTo(13.9195f, 15.48f, 15.4795f, 13.92f, 15.4795f, 12.0f)
                curveTo(15.4795f, 10.08f, 13.9195f, 8.52f, 11.9995f, 8.52f)
                close()
            }
        }
        .build()
        return _recordcircle!!
    }

private var _recordcircle: ImageVector? = null
