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

public val BrokenGroup.Link21: ImageVector
    get() {
        if (_link21 != null) {
            return _link21!!
        }
        _link21 = Builder(name = "Link21", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0598f, 10.9399f)
                curveTo(15.3098f, 13.1899f, 15.3098f, 16.8299f, 13.0598f, 19.0699f)
                curveTo(10.8098f, 21.3099f, 7.1698f, 21.3199f, 4.9299f, 19.0699f)
                curveTo(2.6899f, 16.8199f, 2.6799f, 13.1799f, 4.9299f, 10.9399f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.9707f, 3.1699f)
                curveTo(16.4607f, 3.1999f, 17.9407f, 3.7899f, 19.0707f, 4.9299f)
                curveTo(21.4107f, 7.2699f, 21.4107f, 11.0699f, 19.0707f, 13.4199f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5909f, 13.4099f)
                curveTo(8.2509f, 11.0699f, 8.2509f, 7.2699f, 10.5909f, 4.9199f)
            }
        }
        .build()
        return _link21!!
    }

private var _link21: ImageVector? = null
