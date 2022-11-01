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

public val BoldGroup.`Tag-user`: ImageVector
    get() {
        if (`_tag-user` != null) {
            return `_tag-user`!!
        }
        `_tag-user` = Builder(name = "Tag-user", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.34f, 2.0f, 3.0f, 3.33f, 3.0f, 4.97f)
                verticalLineTo(15.88f)
                curveTo(3.0f, 17.52f, 4.34f, 18.86f, 6.0f, 18.86f)
                horizontalLineTo(6.76f)
                curveTo(7.55f, 18.86f, 8.32f, 19.17f, 8.88f, 19.73f)
                lineTo(10.59f, 21.42f)
                curveTo(11.37f, 22.19f, 12.63f, 22.19f, 13.41f, 21.42f)
                lineTo(15.12f, 19.73f)
                curveTo(15.68f, 19.17f, 16.45f, 18.86f, 17.24f, 18.86f)
                horizontalLineTo(18.0f)
                curveTo(19.66f, 18.86f, 21.0f, 17.52f, 21.0f, 15.88f)
                verticalLineTo(4.97f)
                curveTo(21.0f, 3.33f, 19.66f, 2.0f, 18.0f, 2.0f)
                close()
                moveTo(12.0f, 5.55f)
                curveTo(13.08f, 5.55f, 13.95f, 6.43f, 13.95f, 7.5f)
                curveTo(13.95f, 8.56f, 13.11f, 9.41f, 12.07f, 9.45f)
                curveTo(12.03f, 9.45f, 11.97f, 9.45f, 11.92f, 9.45f)
                curveTo(10.87f, 9.41f, 10.04f, 8.56f, 10.04f, 7.5f)
                curveTo(10.05f, 6.43f, 10.92f, 5.55f, 12.0f, 5.55f)
                close()
                moveTo(14.75f, 14.69f)
                curveTo(13.24f, 15.7f, 10.76f, 15.7f, 9.25f, 14.69f)
                curveTo(7.92f, 13.81f, 7.92f, 12.35f, 9.25f, 11.46f)
                curveTo(10.77f, 10.45f, 13.25f, 10.45f, 14.75f, 11.46f)
                curveTo(16.08f, 12.35f, 16.08f, 13.8f, 14.75f, 14.69f)
                close()
            }
        }
        .build()
        return `_tag-user`!!
    }

private var `_tag-user`: ImageVector? = null
