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

public val TwotoneGroup.Presentionchart: ImageVector
    get() {
        if (_presentionchart != null) {
            return _presentionchart!!
        }
        _presentionchart = Builder(name = "Presentionchart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.9002f, 17.0f)
                horizontalLineTo(18.0902f)
                curveTo(19.9902f, 17.0f, 20.9902f, 16.0f, 20.9902f, 14.1f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.9902f)
                verticalLineTo(14.1f)
                curveTo(3.0002f, 16.0f, 4.0002f, 17.0f, 5.9002f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                horizontalLineTo(22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 22.0f)
                lineTo(12.0f, 20.0f)
                moveTo(12.0f, 20.0f)
                verticalLineTo(17.0f)
                moveTo(12.0f, 20.0f)
                lineTo(16.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 11.0f)
                lineTo(10.65f, 8.37f)
                curveTo(10.9f, 8.16f, 11.23f, 8.22f, 11.4f, 8.5f)
                lineTo(12.6f, 10.5f)
                curveTo(12.77f, 10.78f, 13.1f, 10.83f, 13.35f, 10.63f)
                lineTo(16.5f, 8.0f)
            }
        }
        .build()
        return _presentionchart!!
    }

private var _presentionchart: ImageVector? = null
