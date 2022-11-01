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

public val BrokenGroup.Ontology: ImageVector
    get() {
        if (_ontology != null) {
            return _ontology!!
        }
        _ontology = Builder(name = "Ontology", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.2207f, 6.98f)
                verticalLineTo(5.2f)
                curveTo(2.2207f, 4.75f, 2.7607f, 4.53f, 3.0707f, 4.85f)
                lineTo(17.9007f, 19.68f)
                curveTo(16.1807f, 21.18f, 13.9107f, 22.07f, 11.4207f, 22.0f)
                curveTo(6.2507f, 21.86f, 2.2207f, 17.41f, 2.2207f, 12.24f)
                verticalLineTo(11.08f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.2207f, 4.3f)
                curveTo(7.9307f, 2.81f, 10.1807f, 1.93f, 12.6507f, 2.0f)
                curveTo(17.7807f, 2.14f, 21.7707f, 6.55f, 21.7707f, 11.68f)
                verticalLineTo(18.64f)
                curveTo(21.7707f, 19.09f, 21.2307f, 19.31f, 20.9207f, 18.99f)
                lineTo(6.2207f, 4.3f)
                close()
            }
        }
        .build()
        return _ontology!!
    }

private var _ontology: ImageVector? = null
