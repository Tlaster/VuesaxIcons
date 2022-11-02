package moe.tlaster.icons.vuesax.vuesaxicons.crypto.broken

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
import moe.tlaster.icons.vuesax.vuesaxicons.crypto.BrokenGroup

public val BrokenGroup.Html3: ImageVector
    get() {
        if (_html3 != null) {
            return _html3!!
        }
        _html3 = Builder(name = "Html3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 6.98f)
                lineTo(16.5f, 7.0f)
                lineTo(15.5f, 16.0f)
                lineTo(12.0f, 17.0f)
                lineTo(8.5f, 16.0f)
                lineTo(8.0f, 14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                horizontalLineTo(16.06f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.3202f, 4.91f)
                lineTo(3.1202f, 3.11f)
                curveTo(3.0502f, 2.52f, 3.5202f, 2.0f, 4.1102f, 2.0f)
                horizontalLineTo(19.8802f)
                curveTo(20.4802f, 2.0f, 20.9402f, 2.52f, 20.8702f, 3.11f)
                lineTo(19.0702f, 19.33f)
                curveTo(19.0302f, 19.73f, 18.7402f, 20.07f, 18.3502f, 20.18f)
                lineTo(12.2702f, 21.92f)
                curveTo(12.0902f, 21.97f, 11.9002f, 21.97f, 11.7202f, 21.92f)
                lineTo(5.6402f, 20.18f)
                curveTo(5.2502f, 20.07f, 4.9702f, 19.73f, 4.9202f, 19.33f)
                lineTo(3.8202f, 9.41f)
            }
        }
        .build()
        return _html3!!
    }

private var _html3: ImageVector? = null
