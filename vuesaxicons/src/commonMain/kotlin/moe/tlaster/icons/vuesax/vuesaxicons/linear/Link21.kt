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

public val LinearGroup.Link21: ImageVector
    get() {
        if (_link21 != null) {
            return _link21!!
        }
        _link21 = Builder(name = "Link21", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.27f, 12.0f)
                curveTo(2.48f, 11.05f, 2.0f, 9.83f, 2.0f, 8.5f)
                curveTo(2.0f, 5.48f, 4.47f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(12.5f)
                curveTo(15.52f, 3.0f, 18.0f, 5.48f, 18.0f, 8.5f)
                curveTo(18.0f, 11.52f, 15.53f, 14.0f, 12.5f, 14.0f)
                horizontalLineTo(10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.73f, 12.0f)
                curveTo(21.52f, 12.95f, 22.0f, 14.17f, 22.0f, 15.5f)
                curveTo(22.0f, 18.52f, 19.53f, 21.0f, 16.5f, 21.0f)
                horizontalLineTo(11.5f)
                curveTo(8.48f, 21.0f, 6.0f, 18.52f, 6.0f, 15.5f)
                curveTo(6.0f, 12.48f, 8.47f, 10.0f, 11.5f, 10.0f)
                horizontalLineTo(14.0f)
            }
        }
        .build()
        return _link21!!
    }

private var _link21: ImageVector? = null
