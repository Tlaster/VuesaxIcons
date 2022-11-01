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

public val LinearGroup.Hierarchy3: ImageVector
    get() {
        if (_hierarchy3 != null) {
            return _hierarchy3!!
        }
        _hierarchy3 = Builder(name = "Hierarchy3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                curveTo(6.6568f, 8.0f, 8.0f, 6.6568f, 8.0f, 5.0f)
                curveTo(8.0f, 3.3431f, 6.6568f, 2.0f, 5.0f, 2.0f)
                curveTo(3.3431f, 2.0f, 2.0f, 3.3431f, 2.0f, 5.0f)
                curveTo(2.0f, 6.6568f, 3.3431f, 8.0f, 5.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                curveTo(20.6569f, 15.0f, 22.0f, 13.6569f, 22.0f, 12.0f)
                curveTo(22.0f, 10.3431f, 20.6569f, 9.0f, 19.0f, 9.0f)
                curveTo(17.3431f, 9.0f, 16.0f, 10.3431f, 16.0f, 12.0f)
                curveTo(16.0f, 13.6569f, 17.3431f, 15.0f, 19.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 22.0f)
                curveTo(6.6568f, 22.0f, 8.0f, 20.6569f, 8.0f, 19.0f)
                curveTo(8.0f, 17.3431f, 6.6568f, 16.0f, 5.0f, 16.0f)
                curveTo(3.3431f, 16.0f, 2.0f, 17.3431f, 2.0f, 19.0f)
                curveTo(2.0f, 20.6569f, 3.3431f, 22.0f, 5.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                horizontalLineTo(9.0f)
                curveTo(6.8f, 12.0f, 5.0f, 11.0f, 5.0f, 8.0f)
                verticalLineTo(16.0f)
            }
        }
        .build()
        return _hierarchy3!!
    }

private var _hierarchy3: ImageVector? = null
