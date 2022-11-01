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

public val LinearGroup.`Security-user`: ImageVector
    get() {
        if (`_security-user` != null) {
            return `_security-user`!!
        }
        `_security-user` = Builder(name = "Security-user", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.49f, 2.2301f)
                lineTo(5.5f, 4.1f)
                curveTo(4.35f, 4.53f, 3.41f, 5.89f, 3.41f, 7.12f)
                verticalLineTo(14.55f)
                curveTo(3.41f, 15.73f, 4.1901f, 17.28f, 5.14f, 17.99f)
                lineTo(9.44f, 21.2001f)
                curveTo(10.85f, 22.2601f, 13.17f, 22.2601f, 14.58f, 21.2001f)
                lineTo(18.88f, 17.99f)
                curveTo(19.83f, 17.28f, 20.61f, 15.73f, 20.61f, 14.55f)
                verticalLineTo(7.12f)
                curveTo(20.61f, 5.89f, 19.67f, 4.53f, 18.52f, 4.1f)
                lineTo(13.53f, 2.2301f)
                curveTo(12.68f, 1.9201f, 11.32f, 1.9201f, 10.49f, 2.2301f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0001f, 10.92f)
                curveTo(11.9601f, 10.92f, 11.9101f, 10.92f, 11.8701f, 10.92f)
                curveTo(10.9301f, 10.89f, 10.1801f, 10.11f, 10.1801f, 9.16f)
                curveTo(10.1801f, 8.19f, 10.9701f, 7.4f, 11.9401f, 7.4f)
                curveTo(12.9101f, 7.4f, 13.7001f, 8.19f, 13.7001f, 9.16f)
                curveTo(13.6901f, 10.12f, 12.9401f, 10.89f, 12.0001f, 10.92f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.01f, 13.72f)
                curveTo(9.05f, 14.36f, 9.05f, 15.41f, 10.01f, 16.05f)
                curveTo(11.1f, 16.78f, 12.89f, 16.78f, 13.98f, 16.05f)
                curveTo(14.94f, 15.41f, 14.94f, 14.36f, 13.98f, 13.72f)
                curveTo(12.9f, 12.99f, 11.11f, 12.99f, 10.01f, 13.72f)
                close()
            }
        }
        .build()
        return `_security-user`!!
    }

private var `_security-user`: ImageVector? = null
