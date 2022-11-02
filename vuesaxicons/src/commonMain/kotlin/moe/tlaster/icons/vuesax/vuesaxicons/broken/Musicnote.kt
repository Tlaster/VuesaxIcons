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

public val BrokenGroup.Musicnote: ImageVector
    get() {
        if (_musicnote != null) {
            return _musicnote!!
        }
        _musicnote = Builder(name = "Musicnote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.1107f, 16.98f)
                curveTo(4.0207f, 17.3f, 3.9707f, 17.65f, 3.9707f, 18.0f)
                curveTo(3.9707f, 20.21f, 5.7607f, 22.0f, 7.9707f, 22.0f)
                curveTo(10.1807f, 22.0f, 11.9707f, 20.21f, 11.9707f, 18.0f)
                curveTo(11.9707f, 15.79f, 10.1807f, 14.0f, 7.9707f, 14.0f)
                curveTo(7.6207f, 14.0f, 7.2707f, 14.05f, 6.9507f, 14.13f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.9707f, 18.0f)
                verticalLineTo(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.6105f, 2.11f)
                lineTo(19.0305f, 3.58f)
                curveTo(20.1005f, 3.94f, 20.9805f, 5.15f, 20.9805f, 6.28f)
                verticalLineTo(7.45f)
                curveTo(20.9805f, 8.98f, 19.8005f, 9.83f, 18.3505f, 9.35f)
                lineTo(13.9305f, 7.88f)
                curveTo(12.8605f, 7.52f, 11.9805f, 6.31f, 11.9805f, 5.18f)
                verticalLineTo(4.0f)
                curveTo(11.9705f, 2.48f, 13.1605f, 1.62f, 14.6105f, 2.11f)
                close()
            }
        }
        .build()
        return _musicnote!!
    }

private var _musicnote: ImageVector? = null
