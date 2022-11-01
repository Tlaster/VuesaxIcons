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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import moe.tlaster.icons.vuesax.vuesaxicons.LinearGroup

public val LinearGroup.`Brush-1`: ImageVector
    get() {
        if (`_brush-1` != null) {
            return `_brush-1`!!
        }
        `_brush-1` = Builder(name = "Brush-1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                        strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(9.5f, 19.5f)
                    verticalLineTo(18.0f)
                    horizontalLineTo(4.5f)
                    curveTo(3.95f, 18.0f, 3.45f, 17.78f, 3.09f, 17.41f)
                    curveTo(2.72f, 17.05f, 2.5f, 16.55f, 2.5f, 16.0f)
                    curveTo(2.5f, 14.97f, 3.3f, 14.11f, 4.31f, 14.01f)
                    curveTo(4.37f, 14.0f, 4.43f, 14.0f, 4.5f, 14.0f)
                    horizontalLineTo(19.5f)
                    curveTo(19.57f, 14.0f, 19.63f, 14.0f, 19.69f, 14.01f)
                    curveTo(20.17f, 14.05f, 20.59f, 14.26f, 20.91f, 14.59f)
                    curveTo(21.32f, 14.99f, 21.54f, 15.56f, 21.49f, 16.18f)
                    curveTo(21.4f, 17.23f, 20.45f, 18.0f, 19.39f, 18.0f)
                    horizontalLineTo(14.5f)
                    verticalLineTo(19.5f)
                    curveTo(14.5f, 20.88f, 13.38f, 22.0f, 12.0f, 22.0f)
                    curveTo(10.62f, 22.0f, 9.5f, 20.88f, 9.5f, 19.5f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                        strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(20.17f, 5.3f)
                    lineTo(19.69f, 14.01f)
                    curveTo(19.63f, 14.0f, 19.57f, 14.0f, 19.5f, 14.0f)
                    horizontalLineTo(4.5f)
                    curveTo(4.43f, 14.0f, 4.37f, 14.0f, 4.31f, 14.01f)
                    lineTo(3.83f, 5.3f)
                    curveTo(3.65f, 3.53f, 5.04f, 2.0f, 6.81f, 2.0f)
                    horizontalLineTo(17.19f)
                    curveTo(18.96f, 2.0f, 20.35f, 3.53f, 20.17f, 5.3f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                        strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(7.99f, 2.0f)
                    verticalLineTo(7.0f)
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                        strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                        StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(12.0f, 2.0f)
                    verticalLineTo(4.0f)
                }
            }
        }
        .build()
        return `_brush-1`!!
    }

private var `_brush-1`: ImageVector? = null
