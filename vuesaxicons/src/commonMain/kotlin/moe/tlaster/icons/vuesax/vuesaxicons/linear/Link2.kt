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

public val LinearGroup.Link2: ImageVector
    get() {
        if (_link2 != null) {
            return _link2!!
        }
        _link2 = Builder(name = "Link2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 12.0f)
                curveTo(13.5f, 15.18f, 10.93f, 17.75f, 7.75f, 17.75f)
                curveTo(4.57f, 17.75f, 2.0f, 15.18f, 2.0f, 12.0f)
                curveTo(2.0f, 8.82f, 4.57f, 6.25f, 7.75f, 6.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                curveTo(10.0f, 8.69f, 12.69f, 6.0f, 16.0f, 6.0f)
                curveTo(19.31f, 6.0f, 22.0f, 8.69f, 22.0f, 12.0f)
                curveTo(22.0f, 15.31f, 19.31f, 18.0f, 16.0f, 18.0f)
            }
        }
        .build()
        return _link2!!
    }

private var _link2: ImageVector? = null
