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

public val TwotoneGroup.Lamp1: ImageVector
    get() {
        if (_lamp1 != null) {
            return _lamp1!!
        }
        _lamp1 = Builder(name = "Lamp1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.7807f, 13.6502f)
                verticalLineTo(18.5902f)
                horizontalLineTo(3.2207f)
                verticalLineTo(13.6502f)
                curveTo(3.2207f, 8.8302f, 7.1207f, 4.9302f, 11.9407f, 4.9302f)
                horizontalLineTo(12.0607f)
                curveTo(16.8807f, 4.9302f, 20.7807f, 8.8302f, 20.7807f, 13.6502f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(4.93f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6496f, 18.5898f)
                curveTo(15.5196f, 20.4998f, 13.9296f, 21.9998f, 11.9996f, 21.9998f)
                curveTo(10.0696f, 21.9998f, 8.4796f, 20.4998f, 8.3496f, 18.5898f)
                horizontalLineTo(15.6496f)
                close()
            }
        }
        .build()
        return _lamp1!!
    }

private var _lamp1: ImageVector? = null
