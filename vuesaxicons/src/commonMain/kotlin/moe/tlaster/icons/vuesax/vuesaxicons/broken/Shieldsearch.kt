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

public val BrokenGroup.Shieldsearch: ImageVector
    get() {
        if (_shieldsearch != null) {
            return _shieldsearch!!
        }
        _shieldsearch = Builder(name = "Shieldsearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.4102f, 11.02f)
                verticalLineTo(14.56f)
                curveTo(3.4102f, 15.74f, 4.1902f, 17.29f, 5.1402f, 18.0f)
                lineTo(9.4402f, 21.21f)
                curveTo(10.1402f, 21.74f, 11.0702f, 22.0f, 12.0002f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5902f, 10.5501f)
                verticalLineTo(7.1201f)
                curveTo(20.5902f, 5.8901f, 19.6502f, 4.5301f, 18.5002f, 4.1001f)
                lineTo(13.5102f, 2.2301f)
                curveTo(12.6802f, 1.9201f, 11.3202f, 1.9201f, 10.4902f, 2.2301f)
                lineTo(5.5002f, 4.1101f)
                curveTo(4.3502f, 4.5401f, 3.4102f, 5.9001f, 3.4102f, 7.1201f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 16.0f)
                curveTo(20.0f, 18.21f, 18.21f, 20.0f, 16.0f, 20.0f)
                curveTo(13.79f, 20.0f, 12.0f, 18.21f, 12.0f, 16.0f)
                curveTo(12.0f, 15.27f, 12.19f, 14.59f, 12.53f, 14.01f)
                curveTo(13.22f, 12.81f, 14.51f, 12.01f, 15.99f, 12.01f)
                curveTo(16.6f, 12.01f, 17.17f, 12.15f, 17.69f, 12.39f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.9955f, 21.0f)
                horizontalLineTo(21.0045f)
            }
        }
        .build()
        return _shieldsearch!!
    }

private var _shieldsearch: ImageVector? = null
