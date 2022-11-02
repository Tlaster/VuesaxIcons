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

public val BrokenGroup.Speaker: ImageVector
    get() {
        if (_speaker != null) {
            return _speaker!!
        }
        _speaker = Builder(name = "Speaker", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 13.99f)
                verticalLineTo(6.0f)
                curveTo(5.0f, 3.0f, 6.0f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(18.0f, 2.0f, 19.0f, 3.0f, 19.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(19.0f, 21.0f, 18.0f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(6.0f, 22.0f, 5.0f, 21.0f, 5.0f, 18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.0f)
                curveTo(13.6569f, 18.0f, 15.0f, 16.6569f, 15.0f, 15.0f)
                curveTo(15.0f, 13.3431f, 13.6569f, 12.0f, 12.0f, 12.0f)
                curveTo(10.3431f, 12.0f, 9.0f, 13.3431f, 9.0f, 15.0f)
                curveTo(9.0f, 16.6569f, 10.3431f, 18.0f, 12.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 7.5f)
                curveTo(13.5f, 6.67f, 12.83f, 6.0f, 12.0f, 6.0f)
                curveTo(11.17f, 6.0f, 10.5f, 6.67f, 10.5f, 7.5f)
                curveTo(10.5f, 8.33f, 11.17f, 9.0f, 12.0f, 9.0f)
            }
        }
        .build()
        return _speaker!!
    }

private var _speaker: ImageVector? = null
