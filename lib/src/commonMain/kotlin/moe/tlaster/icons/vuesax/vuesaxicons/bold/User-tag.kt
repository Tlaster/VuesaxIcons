package moe.tlaster.icons.vuesax.vuesaxicons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.BoldGroup

public val BoldGroup.`User-tag`: ImageVector
    get() {
        if (`_user-tag` != null) {
            return `_user-tag`!!
        }
        `_user-tag` = Builder(name = "User-tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.34f, 2.0f, 3.0f, 3.33f, 3.0f, 4.97f)
                verticalLineTo(15.88f)
                curveTo(3.0f, 17.52f, 4.34f, 18.85f, 6.0f, 18.85f)
                horizontalLineTo(6.76f)
                curveTo(7.56f, 18.85f, 8.32f, 19.16f, 8.88f, 19.72f)
                lineTo(10.59f, 21.41f)
                curveTo(11.37f, 22.18f, 12.64f, 22.18f, 13.42f, 21.41f)
                lineTo(15.13f, 19.72f)
                curveTo(15.69f, 19.16f, 16.46f, 18.85f, 17.25f, 18.85f)
                horizontalLineTo(18.0f)
                curveTo(19.66f, 18.85f, 21.0f, 17.52f, 21.0f, 15.88f)
                verticalLineTo(4.97f)
                curveTo(21.0f, 3.33f, 19.66f, 2.0f, 18.0f, 2.0f)
                close()
                moveTo(12.0f, 5.75f)
                curveTo(13.29f, 5.75f, 14.33f, 6.79f, 14.33f, 8.08f)
                curveTo(14.33f, 9.37f, 13.29f, 10.41f, 12.0f, 10.41f)
                curveTo(10.71f, 10.41f, 9.67f, 9.36f, 9.67f, 8.08f)
                curveTo(9.67f, 6.79f, 10.71f, 5.75f, 12.0f, 5.75f)
                close()
                moveTo(14.68f, 15.06f)
                horizontalLineTo(9.32f)
                curveTo(8.51f, 15.06f, 8.04f, 14.16f, 8.49f, 13.49f)
                curveTo(9.17f, 12.48f, 10.49f, 11.8f, 12.0f, 11.8f)
                curveTo(13.51f, 11.8f, 14.83f, 12.48f, 15.51f, 13.49f)
                curveTo(15.96f, 14.16f, 15.48f, 15.06f, 14.68f, 15.06f)
                close()
            }
        }
        .build()
        return `_user-tag`!!
    }

private var `_user-tag`: ImageVector? = null
