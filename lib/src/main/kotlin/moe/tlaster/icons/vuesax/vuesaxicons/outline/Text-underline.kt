package moe.tlaster.icons.vuesax.vuesaxicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.OutlineGroup

public val OutlineGroup.`Text-underline`: ImageVector
    get() {
        if (`_text-underline` != null) {
            return `_text-underline`!!
        }
        `_text-underline` = Builder(name = "Text-underline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 21.75f)
                horizontalLineTo(5.0f)
                curveTo(4.59f, 21.75f, 4.25f, 21.41f, 4.25f, 21.0f)
                curveTo(4.25f, 20.59f, 4.59f, 20.25f, 5.0f, 20.25f)
                horizontalLineTo(19.0f)
                curveTo(19.41f, 20.25f, 19.75f, 20.59f, 19.75f, 21.0f)
                curveTo(19.75f, 21.41f, 19.41f, 21.75f, 19.0f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.75f)
                curveTo(7.73f, 17.75f, 4.25f, 14.27f, 4.25f, 10.0f)
                verticalLineTo(3.0f)
                curveTo(4.25f, 2.59f, 4.59f, 2.25f, 5.0f, 2.25f)
                curveTo(5.41f, 2.25f, 5.75f, 2.59f, 5.75f, 3.0f)
                verticalLineTo(10.0f)
                curveTo(5.75f, 13.45f, 8.55f, 16.25f, 12.0f, 16.25f)
                curveTo(15.45f, 16.25f, 18.25f, 13.45f, 18.25f, 10.0f)
                verticalLineTo(3.0f)
                curveTo(18.25f, 2.59f, 18.59f, 2.25f, 19.0f, 2.25f)
                curveTo(19.41f, 2.25f, 19.75f, 2.59f, 19.75f, 3.0f)
                verticalLineTo(10.0f)
                curveTo(19.75f, 14.27f, 16.27f, 17.75f, 12.0f, 17.75f)
                close()
            }
        }
        .build()
        return `_text-underline`!!
    }

private var `_text-underline`: ImageVector? = null
