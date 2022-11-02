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

public val BrokenGroup.Cardcoin: ImageVector
    get() {
        if (_cardcoin != null) {
            return _cardcoin!!
        }
        _cardcoin = Builder(name = "Cardcoin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 17.0601f)
                horizontalLineTo(12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.6898f, 22.0f)
                horizontalLineTo(4.2297f)
                curveTo(2.4497f, 22.0f, 2.0098f, 21.56f, 2.0098f, 19.8f)
                verticalLineTo(15.7f)
                curveTo(2.0098f, 13.94f, 2.4497f, 13.5f, 4.2297f, 13.5f)
                horizontalLineTo(9.7897f)
                curveTo(11.5697f, 13.5f, 12.0098f, 13.94f, 12.0098f, 15.7f)
                verticalLineTo(19.81f)
                curveTo(12.0098f, 21.57f, 11.5697f, 22.01f, 9.7897f, 22.01f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                curveTo(22.0f, 18.87f, 18.87f, 22.0f, 15.0f, 22.0f)
                lineTo(16.05f, 20.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                curveTo(2.0f, 5.13f, 5.13f, 2.0f, 9.0f, 2.0f)
                lineTo(7.95f, 3.75f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.5f, 11.0f)
                curveTo(20.99f, 11.0f, 23.0f, 8.99f, 23.0f, 6.5f)
                curveTo(23.0f, 4.01f, 20.99f, 2.0f, 18.5f, 2.0f)
                curveTo(16.01f, 2.0f, 14.0f, 4.01f, 14.0f, 6.5f)
                curveTo(14.0f, 7.09f, 14.11f, 7.65f, 14.32f, 8.16f)
            }
        }
        .build()
        return _cardcoin!!
    }

private var _cardcoin: ImageVector? = null
