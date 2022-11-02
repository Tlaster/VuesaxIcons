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

public val BrokenGroup.Archive2: ImageVector
    get() {
        if (_archive2 != null) {
            return _archive2!!
        }
        _archive2 = Builder(name = "Archive2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 13.01f)
                verticalLineTo(10.22f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 10.22f)
                verticalLineTo(19.0f)
                curveTo(19.5f, 21.0f, 19.0f, 22.0f, 16.5f, 22.0f)
                horizontalLineTo(7.5f)
                curveTo(5.0f, 22.0f, 4.5f, 21.0f, 4.5f, 19.0f)
                verticalLineTo(16.97f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(21.0f, 2.0f, 22.0f, 3.0f, 22.0f, 5.0f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 9.0f, 21.0f, 10.0f, 19.0f, 10.0f)
                horizontalLineTo(5.0f)
                curveTo(3.0f, 10.0f, 2.0f, 9.0f, 2.0f, 7.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 3.0f, 3.0f, 2.0f, 5.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.1797f, 14.0f)
                horizontalLineTo(13.8197f)
            }
        }
        .build()
        return _archive2!!
    }

private var _archive2: ImageVector? = null
