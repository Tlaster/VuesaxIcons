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

public val LinearGroup.`Document-favorite`: ImageVector
    get() {
        if (`_document-favorite` != null) {
            return `_document-favorite`!!
        }
        `_document-favorite` = Builder(name = "Document-favorite", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 20.0f, 20.0f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(4.0f, 22.0f, 2.0f, 20.0f, 2.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(2.0f, 4.0f, 4.0f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                horizontalLineTo(18.0f)
                curveTo(15.0f, 10.0f, 14.0f, 9.0f, 14.0f, 6.0f)
                verticalLineTo(2.0f)
                lineTo(22.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF292D32)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.62f, 15.7301f)
                curveTo(6.29f, 14.7001f, 6.68f, 13.4301f, 7.75f, 13.0801f)
                curveTo(8.32f, 12.9001f, 9.02f, 13.0501f, 9.41f, 13.6001f)
                curveTo(9.78f, 13.0301f, 10.51f, 12.9001f, 11.07f, 13.0801f)
                curveTo(12.15f, 13.4301f, 12.53f, 14.7001f, 12.21f, 15.7301f)
                curveTo(11.7f, 17.3601f, 9.91f, 18.2101f, 9.41f, 18.2101f)
                curveTo(8.92f, 18.2001f, 7.15f, 17.3701f, 6.62f, 15.7301f)
                close()
            }
        }
        .build()
        return `_document-favorite`!!
    }

private var `_document-favorite`: ImageVector? = null
