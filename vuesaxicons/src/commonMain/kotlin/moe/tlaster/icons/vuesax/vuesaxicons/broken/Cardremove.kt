package moe.tlaster.icons.vuesax.vuesaxicons.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.BrokenGroup

public val BrokenGroup.Cardremove: ImageVector
    get() {
        if (_cardremove != null) {
            return _cardremove!!
        }
        _cardremove = Builder(name = "Cardremove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 10.03f)
                horizontalLineTo(21.9f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.4604f, 20.53f)
                horizontalLineTo(6.3503f)
                curveTo(2.8003f, 20.53f, 1.9004f, 19.65f, 1.9004f, 16.14f)
                verticalLineTo(7.92f)
                curveTo(1.9004f, 4.74f, 2.6404f, 3.72f, 5.4304f, 3.56f)
                curveTo(5.7104f, 3.55f, 6.0203f, 3.54f, 6.3503f, 3.54f)
                horizontalLineTo(17.4604f)
                curveTo(21.0104f, 3.54f, 21.9103f, 4.42f, 21.9103f, 7.93f)
                verticalLineTo(12.34f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.9004f, 22.03f)
                curveTo(20.1095f, 22.03f, 21.9004f, 20.2392f, 21.9004f, 18.03f)
                curveTo(21.9004f, 15.8209f, 20.1095f, 14.03f, 17.9004f, 14.03f)
                curveTo(15.6913f, 14.03f, 13.9004f, 15.8209f, 13.9004f, 18.03f)
                curveTo(13.9004f, 20.2392f, 15.6913f, 22.03f, 17.9004f, 22.03f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.9694f, 19.15f)
                lineTo(16.8594f, 17.03f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.9501f, 17.0601f)
                lineTo(16.8301f, 19.1701f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.9004f, 16.03f)
                horizontalLineTo(9.9004f)
            }
        }
        .build()
        return _cardremove!!
    }

private var _cardremove: ImageVector? = null
