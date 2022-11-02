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

public val TwotoneGroup.Rotateright1: ImageVector
    get() {
        if (_rotateright1 != null) {
            return _rotateright1!!
        }
        _rotateright1 = Builder(name = "Rotateright1", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.75f, 22.0f)
                horizontalLineTo(12.25f)
                curveTo(8.5f, 22.0f, 7.0f, 20.5f, 7.0f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(7.0f, 8.5f, 8.5f, 7.0f, 12.25f, 7.0f)
                horizontalLineTo(16.75f)
                curveTo(20.5f, 7.0f, 22.0f, 8.5f, 22.0f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 20.5f, 20.5f, 22.0f, 16.75f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    fillAlpha = 0.4f, strokeAlpha = 0.4f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = StrokeJoin.Companion.Round, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                curveTo(2.0f, 5.13f, 5.13f, 2.0f, 9.0f, 2.0f)
                lineTo(7.95f, 3.75f)
            }
        }
        .build()
        return _rotateright1!!
    }

private var _rotateright1: ImageVector? = null
