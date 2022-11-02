package moe.tlaster.icons.vuesax.vuesaxicons.linear

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
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.Cardremove: ImageVector
    get() {
        if (_cardremove != null) {
            return _cardremove!!
        }
        _cardremove = Builder(name = "Cardremove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(1.8984f, 10.0303f)
                horizontalLineTo(21.8984f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.4584f, 20.53f)
                horizontalLineTo(6.3484f)
                curveTo(2.7984f, 20.53f, 1.8984f, 19.65f, 1.8984f, 16.14f)
                verticalLineTo(7.92f)
                curveTo(1.8984f, 4.74f, 2.6384f, 3.72f, 5.4284f, 3.56f)
                curveTo(5.7084f, 3.55f, 6.0184f, 3.54f, 6.3484f, 3.54f)
                horizontalLineTo(17.4584f)
                curveTo(21.0084f, 3.54f, 21.9084f, 4.42f, 21.9084f, 7.93f)
                verticalLineTo(12.34f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.8984f, 22.0303f)
                curveTo(20.1076f, 22.0303f, 21.8984f, 20.2394f, 21.8984f, 18.0303f)
                curveTo(21.8984f, 15.8211f, 20.1076f, 14.0303f, 17.8984f, 14.0303f)
                curveTo(15.6893f, 14.0303f, 13.8984f, 15.8211f, 13.8984f, 18.0303f)
                curveTo(13.8984f, 20.2394f, 15.6893f, 22.0303f, 17.8984f, 22.0303f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.9694f, 19.1503f)
                lineTo(16.8594f, 17.0303f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.9481f, 17.0603f)
                lineTo(16.8281f, 19.1703f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.8984f, 16.0303f)
                horizontalLineTo(9.8984f)
            }
        }
        .build()
        return _cardremove!!
    }

private var _cardremove: ImageVector? = null
