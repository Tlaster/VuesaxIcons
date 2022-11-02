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

public val BrokenGroup.Frame2: ImageVector
    get() {
        if (_frame2 != null) {
            return _frame2!!
        }
        _frame2 = Builder(name = "Frame2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.6792f, 3.96f)
                curveTo(16.1592f, 4.67f, 16.4392f, 5.52f, 16.4392f, 6.44f)
                curveTo(16.4292f, 8.84f, 14.5392f, 10.79f, 12.1592f, 10.87f)
                curveTo(12.0592f, 10.86f, 11.9392f, 10.86f, 11.8292f, 10.87f)
                curveTo(9.6192f, 10.8f, 7.8292f, 9.11f, 7.5892f, 6.95f)
                curveTo(7.2992f, 4.38f, 9.4092f, 2.0f, 11.9892f, 2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.9908f, 14.56f)
                curveTo(4.5708f, 16.18f, 4.5708f, 18.82f, 6.9908f, 20.43f)
                curveTo(9.7408f, 22.27f, 14.2508f, 22.27f, 17.0008f, 20.43f)
                curveTo(19.4208f, 18.81f, 19.4208f, 16.17f, 17.0008f, 14.56f)
                curveTo(14.2708f, 12.73f, 9.7608f, 12.73f, 6.9908f, 14.56f)
                close()
            }
        }
        .build()
        return _frame2!!
    }

private var _frame2: ImageVector? = null
