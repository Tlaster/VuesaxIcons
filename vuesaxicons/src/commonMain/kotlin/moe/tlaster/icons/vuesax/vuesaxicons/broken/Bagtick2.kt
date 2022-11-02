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

public val BrokenGroup.Bagtick2: ImageVector
    get() {
        if (_bagtick2 != null) {
            return _bagtick2!!
        }
        _bagtick2 = Builder(name = "Bagtick2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveTo(14.2091f, 19.0f, 16.0f, 17.2091f, 16.0f, 15.0f)
                curveTo(16.0f, 12.7909f, 14.2091f, 11.0f, 12.0f, 11.0f)
                curveTo(9.7909f, 11.0f, 8.0f, 12.7909f, 8.0f, 15.0f)
                curveTo(8.0f, 17.2091f, 9.7909f, 19.0f, 12.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.4395f, 15.0f)
                lineTo(11.0895f, 15.65f)
                curveTo(11.2795f, 15.84f, 11.5895f, 15.85f, 11.7795f, 15.66f)
                lineTo(13.5595f, 14.02f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.8108f, 16.56f)
                lineTo(4.0408f, 18.43f)
                curveTo(4.2608f, 20.39f, 4.9808f, 22.0f, 9.0008f, 22.0f)
                horizontalLineTo(15.0008f)
                curveTo(19.0208f, 22.0f, 19.7408f, 20.39f, 19.9508f, 18.43f)
                lineTo(20.7008f, 12.43f)
                curveTo(20.9708f, 9.99f, 20.2708f, 8.0f, 16.0008f, 8.0f)
                horizontalLineTo(8.0008f)
                curveTo(3.7308f, 8.0f, 3.0308f, 9.99f, 3.3008f, 12.43f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 7.67f)
                verticalLineTo(6.7f)
                curveTo(7.5f, 4.45f, 9.31f, 2.24f, 11.56f, 2.03f)
                curveTo(14.24f, 1.77f, 16.5f, 3.88f, 16.5f, 6.51f)
                verticalLineTo(7.89f)
            }
        }
        .build()
        return _bagtick2!!
    }

private var _bagtick2: ImageVector? = null
