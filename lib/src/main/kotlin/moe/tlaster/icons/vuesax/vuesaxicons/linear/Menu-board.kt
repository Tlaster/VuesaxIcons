package moe.tlaster.icons.vuesax.vuesaxicons.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Menu-board`: ImageVector
    get() {
        if (`_menu-board` != null) {
            return `_menu-board`!!
        }
        `_menu-board` = Builder(name = "Menu-board", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.93f, 6.76f)
                lineTo(18.56f, 20.29f)
                curveTo(18.32f, 21.3f, 17.42f, 22.0f, 16.38f, 22.0f)
                horizontalLineTo(3.24f)
                curveTo(1.73f, 22.0f, 0.65f, 20.5199f, 1.1f, 19.0699f)
                lineTo(5.31f, 5.55f)
                curveTo(5.6f, 4.6101f, 6.47f, 3.96f, 7.45f, 3.96f)
                horizontalLineTo(19.75f)
                curveTo(20.7f, 3.96f, 21.49f, 4.54f, 21.82f, 5.34f)
                curveTo(22.01f, 5.77f, 22.05f, 6.26f, 21.93f, 6.76f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 22.0f)
                horizontalLineTo(20.78f)
                curveTo(22.07f, 22.0f, 23.08f, 20.91f, 22.99f, 19.62f)
                lineTo(22.0f, 6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.68f, 6.38f)
                lineTo(10.72f, 2.0601f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.38f, 6.39f)
                lineTo(17.32f, 2.0501f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.7f, 12.0f)
                horizontalLineTo(15.7f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.7f, 16.0f)
                horizontalLineTo(14.7f)
            }
        }
        .build()
        return `_menu-board`!!
    }

private var `_menu-board`: ImageVector? = null
