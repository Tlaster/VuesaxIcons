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

public val OutlineGroup.Flashcircle: ImageVector
    get() {
        if (_flashcircle != null) {
            return _flashcircle!!
        }
        _flashcircle = Builder(name = "Flashcircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12.0f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12.0f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12.0f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12.0f, 22.75f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12.0f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12.0f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12.0f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12.0f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF292D32)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.71f, 17.84f)
                curveTo(9.42f, 17.84f, 9.2001f, 17.7401f, 9.0701f, 17.6401f)
                curveTo(8.8f, 17.4601f, 8.39f, 17.0f, 8.65f, 15.97f)
                lineTo(9.4201f, 12.86f)
                lineTo(8.5f, 12.63f)
                curveTo(7.57f, 12.4f, 7.3601f, 11.81f, 7.32f, 11.57f)
                curveTo(7.28f, 11.33f, 7.26f, 10.7001f, 8.04f, 10.1501f)
                lineTo(13.22f, 6.56f)
                curveTo(14.09f, 5.96f, 14.66f, 6.18f, 14.93f, 6.36f)
                curveTo(15.2f, 6.54f, 15.61f, 7.0001f, 15.35f, 8.0301f)
                lineTo(14.58f, 11.1401f)
                lineTo(15.5f, 11.37f)
                curveTo(16.43f, 11.6f, 16.64f, 12.19f, 16.68f, 12.44f)
                curveTo(16.72f, 12.69f, 16.74f, 13.31f, 15.96f, 13.86f)
                lineTo(10.78f, 17.45f)
                curveTo(10.35f, 17.74f, 10.0f, 17.84f, 9.71f, 17.84f)
                close()
                moveTo(9.11f, 11.24f)
                lineTo(10.5101f, 11.5901f)
                curveTo(10.9101f, 11.6901f, 11.16f, 12.1f, 11.06f, 12.5f)
                lineTo(10.18f, 16.0401f)
                lineTo(14.8901f, 12.7701f)
                lineTo(13.49f, 12.4201f)
                curveTo(13.09f, 12.3201f, 12.84f, 11.91f, 12.94f, 11.51f)
                lineTo(13.8201f, 7.97f)
                lineTo(9.11f, 11.24f)
                close()
            }
        }
        .build()
        return _flashcircle!!
    }

private var _flashcircle: ImageVector? = null
