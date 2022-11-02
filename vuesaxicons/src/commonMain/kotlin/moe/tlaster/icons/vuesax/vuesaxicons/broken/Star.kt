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

public val BrokenGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.3192f, 11.91f)
                curveTo(22.4892f, 10.74f, 22.1092f, 9.56f, 20.4792f, 9.28f)
                lineTo(17.9292f, 8.86f)
                curveTo(17.4992f, 8.79f, 16.9892f, 8.41f, 16.7992f, 8.02f)
                lineTo(15.3892f, 5.2f)
                curveTo(14.6292f, 3.67f, 13.3792f, 3.67f, 12.6192f, 5.2f)
                lineTo(11.2092f, 8.02f)
                curveTo(11.0192f, 8.41f, 10.5092f, 8.78f, 10.0792f, 8.86f)
                lineTo(7.5292f, 9.28f)
                curveTo(5.8992f, 9.55f, 5.5192f, 10.73f, 6.6892f, 11.91f)
                lineTo(8.6792f, 13.9f)
                curveTo(9.0092f, 14.23f, 9.1992f, 14.88f, 9.0892f, 15.35f)
                lineTo(8.5192f, 17.81f)
                curveTo(8.0692f, 19.75f, 9.1092f, 20.51f, 10.8192f, 19.49f)
                lineTo(13.2092f, 18.07f)
                curveTo(13.6392f, 17.81f, 14.3592f, 17.81f, 14.7892f, 18.07f)
                lineTo(17.1792f, 19.49f)
                curveTo(18.8892f, 20.5f, 19.9292f, 19.75f, 19.4792f, 17.81f)
                lineTo(18.9092f, 15.35f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                horizontalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                horizontalLineTo(2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                horizontalLineTo(2.0f)
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
