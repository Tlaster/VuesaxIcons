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

public val LinearGroup.Musicnote: ImageVector
    get() {
        if (_musicnote != null) {
            return _musicnote!!
        }
        _musicnote = Builder(name = "Musicnote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.97f, 22.0f)
                curveTo(10.1791f, 22.0f, 11.97f, 20.2091f, 11.97f, 18.0f)
                curveTo(11.97f, 15.7909f, 10.1791f, 14.0f, 7.97f, 14.0f)
                curveTo(5.7608f, 14.0f, 3.97f, 15.7909f, 3.97f, 18.0f)
                curveTo(3.97f, 20.2091f, 5.7608f, 22.0f, 7.97f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.97f, 18.0f)
                verticalLineTo(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.61f, 2.11f)
                lineTo(19.03f, 3.58f)
                curveTo(20.1f, 3.94f, 20.98f, 5.15f, 20.98f, 6.28f)
                verticalLineTo(7.45f)
                curveTo(20.98f, 8.98f, 19.8f, 9.83f, 18.35f, 9.35f)
                lineTo(13.93f, 7.88f)
                curveTo(12.86f, 7.52f, 11.98f, 6.31f, 11.98f, 5.18f)
                verticalLineTo(4.0f)
                curveTo(11.97f, 2.48f, 13.16f, 1.62f, 14.61f, 2.11f)
                close()
            }
        }
        .build()
        return _musicnote!!
    }

private var _musicnote: ImageVector? = null
